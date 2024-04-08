package com.example.praca_10;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        TextView headerView = findViewById(R.id.selectedMenuItem);
        if (item.getItemId() == R.id.action_settings) {
            headerView.setText("Настройки");
            return true;
        } else if (item.getItemId() == R.id.open_settings) {
            headerView.setText("Открыть");
            return true;
        } else if (item.getItemId() == R.id.save_settings) {
            headerView.setText("Сохранить");
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void openSecondActivity(View view) {
        // Создаем интент для запуска второй активити
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }


}
