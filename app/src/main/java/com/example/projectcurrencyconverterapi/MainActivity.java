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

    private Button buttonConverter;

    private TextView tvResultado;

    private List<String> moedas = List.of("USD", "EUR", "GBP", "JPY", "AUD", "CAD", "CHF", "CNY", "HKD", "NZD");

    private Map<String, Double> taxasDeCambio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
}
}
