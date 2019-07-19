package com.poi.test;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;

import java.io.File;

public class POI_demo {
    @Autowired
    private ConversionService conversionService;

    public static void main(String[] args) {

        Workbook wb = new HSSFWorkbook();

    }
}
