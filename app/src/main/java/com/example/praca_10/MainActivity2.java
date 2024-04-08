package com.example.praca_10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0 // Группа
                ,1 // id
                ,0 //порядок
                ,"Создать"); // заголовок
        menu.add(0,2,1,"Открыть");
        menu.add(0,3,2,"Сохранить");
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        TextView headerView = findViewById(R.id.selectedMenuItem);
        switch(id){
            case 1 :
                headerView.setText("Создать документ");
                return true;
            case 2:
                headerView.setText("Открыть документ");
                return true;
            case 3:
                headerView.setText("Сохранить документ");
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void openSecondActivity(View view) {
        // Создаем интент для запуска второй активити
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}