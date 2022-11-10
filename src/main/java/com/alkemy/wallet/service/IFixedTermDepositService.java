package com.alkemy.wallet.service;

import com.alkemy.wallet.model.FixedTermDeposit;
import com.alkemy.wallet.dto.FixedTermDepositDto;

import java.util.List;

public interface IFixedTermDepositService {

    FixedTermDepositDto save(FixedTermDepositDto fixedTermDepositDto, String userName);

    List<FixedTermDepositDto> getAll();


    List<FixedTermDeposit> findAll();

    FixedTermDepositDto getById(long id);

    FixedTermDepositDto update(long id, FixedTermDepositDto fixedTermDepositDto);

    void delete(long id);

}
