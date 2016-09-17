package com.anybuy.service;

import com.anybuy.model.CardHistory;

import java.util.List;

/**
 * @author houbinbin
 * @since 2016/09/17
 */
public interface CardHistoryService {

    List<CardHistory> findAllCardHistorysByPage(int pageNum);

    CardHistory getCardHistory(Long id);

    int saveCardHistory(CardHistory cardHistory);

    int updateCardHistory(CardHistory cardHistory);

    int deleteCardHistory(Long id);

}