package com.api.nyx.gastosrecife.util.converter;

import com.opencsv.bean.AbstractBeanField;
import com.opencsv.exceptions.CsvDataTypeMismatchException;

import java.math.BigDecimal;

public class BigDecimalConverter extends AbstractBeanField<BigDecimal,String> {

    @Override
    protected Object convert(String value) throws CsvDataTypeMismatchException {
        try {
            return new BigDecimal(value.replace(",", "."));
        } catch (NumberFormatException e) {
            throw new CsvDataTypeMismatchException(value + " não é um número válido.", e.getClass());
        }
    }
}
