package com.anybuy.service;

import com.anybuy.model.Sort;

import java.util.List;

/**
 * @author kangyonggan
 * @since 2016/09/17
 */
public interface SortService {

    List<Sort> findSorts();

    Sort findSortByCode(String sortCode);

}