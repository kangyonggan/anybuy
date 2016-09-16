package com.anybuy.util.seq;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by houbinbin on 16/9/9.
 */
@Log4j2
public class IdGenerator implements Id {

    /**
     * 默认时间戳格式
     */
    private static final String DATE_FORMAT_STR_17 = "yyyyMMddhhmmssSSS";

    private static final int DEFAULT_CAPACITY = 1000;

    private static final int ID_LENGTH = 3;

    private static final String ZERO_STR = "0";

    private BlockingQueue<Integer> ids = new ArrayBlockingQueue(DEFAULT_CAPACITY);

    IdGenerator() {
        initIds();
    }


    @Override
    public String getId() {
        Date now = new Date();
        Integer id = null;

        try {
            id = ids.poll(DEFAULT_CAPACITY, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            log.error("InterruptedException:{}", e);
        }

        if(id == null) {
            id = ids.poll();
        }

        if(id == null) {
            throw new RuntimeException("生成ID失败");
        } else {
            if(id == (DEFAULT_CAPACITY-1)) {
                this.initIds();
            }

            String dateFormatStr = DateFormatUtils.format(now, DATE_FORMAT_STR_17);
            return dateFormatStr + StringUtils.leftPad(String.valueOf(id), ID_LENGTH, ZERO_STR);
        }

    }


    private void initIds() {
        for(int i = NumberUtils.INTEGER_ZERO; i < DEFAULT_CAPACITY; ++i) {
            this.ids.offer(i);
        }
    }

}
