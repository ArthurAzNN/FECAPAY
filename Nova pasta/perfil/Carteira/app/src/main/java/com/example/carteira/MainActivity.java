package com.example.carteira;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configurar cliques nos cards de atividades
        setupActivityCards();

        // Configurar cliques na navegação inferior
        setupBottomNavigation();
    }

    private void setupActivityCards() {
        View cardAccount = findViewById(R.id.card_account);
        View cardFinancial = findViewById(R.id.card_financial);
        View cardHelp = findViewById(R.id.card_help);
        View btnLearnMore = findViewById(R.id.btn_learn_more);

        cardAccount.setOnClickListener(v -> {
            Toast.makeText(this, "Conta selecionada", Toast.LENGTH_SHORT).show();
            // Implementar navegação para a tela de Conta
        });

        cardFinancial.setOnClickListener(v -> {
            Toast.makeText(this, "Financeiro selecionado", Toast.LENGTH_SHORT).show();
            // Implementar navegação para a tela Financeira
        });

        cardHelp.setOnClickListener(v -> {
            Toast.makeText(this, "Ajuda selecionada", Toast.LENGTH_SHORT).show();
            // Implementar navegação para a tela de Ajuda
        });

        btnLearnMore.setOnClickListener(v -> {
            Toast.makeText(this, "Saiba mais sobre o cartão", Toast.LENGTH_SHORT).show();
            // Implementar navegação para a tela de informações do cartão
        });
    }

    private void setupBottomNavigation() {
        LinearLayout navHome = findViewById(R.id.nav_home);
        LinearLayout navFinancial = findViewById(R.id.nav_financial);
        LinearLayout navProfile = findViewById(R.id.nav_profile);

        navHome.setOnClickListener(v -> {
            // Já estamos na tela inicial
            Toast.makeText(this, "Você já está na tela inicial", Toast.LENGTH_SHORT).show();
        });

        navFinancial.setOnClickListener(v -> {
            Toast.makeText(this, "Navegando para Financeiro", Toast.LENGTH_SHORT).show();
            // Implementar navegação para a tela Financeira
        });

        navProfile.setOnClickListener(v -> {
            Toast.makeText(this, "Navegando para Perfil", Toast.LENGTH_SHORT).show();
            // Implementar navegação para a tela de Perfil
        });
    }
}
