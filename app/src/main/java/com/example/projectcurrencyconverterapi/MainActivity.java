package com.example.projectcurrencyconverterapi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Map;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

//import
import com.example.projectcurrencyconverterapi.ExchangeRateService;
import com.example.projectcurrencyconverterapi.RetrofitClient;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerMoedaOrigem, spinnerMoedaDestino;

    private Button btnConverter;
    private EditText etValor;
    private TextView tvResultado;

    private List<String> moedas = List.of("USD", "EUR", "GBP", "JPY", "AUD", "CAD", "CHF", "CNY", "HKD", "NZD");

    private Map<String, Double> taxasDeCambio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Define o layout da atividade

        // Inicializa os componentes da interface

        spinnerMoedaOrigem = findViewById(R.id.spinnerMoedaOrigem);
        spinnerMoedaDestino = findViewById(R.id.spinnerMoedaDestino);
        etValor = findViewById(R.id.etValor);
        btnConverter = findViewById(R.id.btnConverter);
        tvResultado = findViewById(R.id.tvResultado);

        // Configura o Spinner de Moedas de Origem
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, moedas);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMoedaOrigem.setAdapter(adapter);
        spinnerMoedaDestino.setAdapter(adapter);

        // Carrega as taxas de cambio da API

        // Configura o botão de conversã
        btnConverter.setOnClickListener(view -> converterMoeda());

    }
// Metodo para carregar taxas de cambio da API
private void carregarTaxasDeCambio(){
}
// Metodo para converter o valor de uma moeda para outra
private void converterMoeda(){
        ExchangeRateService service = RetrofitClient.getInstance(); // I

}
}
