package com.lotto.app;

import org.apache.log4j.Logger;

import com.lotto.app.ServiceLocator;
import com.lotto.model.LottoResult;
import com.lotto.services.LottoService;

public class LottoApp {
	private static Logger logger = Logger.getLogger(LottoApp.class);
	private static LottoResult lottoResult;

	public static void main(String[] args) {
		lottoResult = new LottoResult();
		try {

			LottoService lottoService = ServiceLocator.getLottoService();
			lottoResult = lottoService.jouerLotto();
			System.out.print(
					lottoResult.getFirstTirage() + lottoResult.getSecondTirage() + lottoResult.getThirdTirage());

		} catch (Exception e) {
			logger.error("Une erreur est survenue : " + e.getMessage());
		}
	}
}
