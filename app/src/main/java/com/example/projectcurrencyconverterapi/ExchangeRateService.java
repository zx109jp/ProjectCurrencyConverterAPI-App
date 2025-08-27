package com.example.projectcurrencyconverterapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
public interface ExchangeRateService {
    /**
     * Metodo para obter taxas de cambios recentes

     */

    $GET("/v6/{apiKey}/latest/{baseCurrency}")
        Call<ExchangeRatesResponse> getExchangeRates(

        @Path("apiKey") String apiKey,
    // Substitui {apiKey} na URL com valor fornecido
        @Path("baseCurrency") String baseCurrency,

    // Subtitui {baseCurrency} na URL com valor fornecido
        );
}
