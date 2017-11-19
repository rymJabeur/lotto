package com.lotto.services;


import org.springframework.stereotype.Service;

import com.lotto.model.LottoResult;


@Service
public interface LottoService {
	public LottoResult jouerLotto();
}
