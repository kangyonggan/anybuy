package com.anybuy.service.impl;

import com.anybuy.model.Sort;
import com.anybuy.service.SortService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author kangyonggan
 * @since 16/9/17
 */
@Service
@Transactional
public class SortServiceImpl extends BaseService<Sort> implements SortService {

    @Override
    public List<Sort> findSorts() {
        Sort sort = new Sort();
        sort.setIsDeleted((byte) 0);

        return super.select(sort);
    }

    @Override
    public Sort findSortByCode(String sortCode) {
        Sort sort = new Sort();
        sort.setIsDeleted((byte) 0);
        sort.setSortCode(sortCode);

        return super.selectOne(sort);
    }
}
