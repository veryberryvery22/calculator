package com.hanbit.calculator.service;

import com.hanbit.calculator.domain.CalcDTO;

/**
 * Created by hb2018 on 2016-12-10.
 */

public class CelcServiceImpl implements CalcService{
    @Override
    public int plus(CalcDTO param) {
        return param.getNum1() + param.getNum2();
    }

    @Override
    public int minus(CalcDTO param) {
        return param.getNum1() - param.getNum2();

    }

    @Override
    public int multi(CalcDTO param) {
        return param.getNum1() * param.getNum2();

    }

    @Override
    public int divide(CalcDTO param) {
        return param.getNum1() / param.getNum2();

    }
}
