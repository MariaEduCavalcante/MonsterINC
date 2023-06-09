package com.example.monstersawiki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    // Declara elementos
    ImageButton btn1;
    ImageButton btn2;
    ImageButton btn3;
    ImageButton btn4;
    ImageButton btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Esconde barra superior
        getSupportActionBar().hide();

        // Elementos pelo ID
        btn1 = findViewById(R.id.btncarteira);
        btn2 = findViewById(R.id.btnPersona);
        btn3 = findViewById(R.id.btnstory);
        btn4 = findViewById(R.id.btndoor);
        btn5 = findViewById(R.id.btnuniversity);
    }

    // Intents para as outras activities
    public void openID(View view){
        Intent intent = new Intent(this, menuID.class);
        startActivity(intent);
    }
    public void openCharacter(View view){
        Intent intent = new Intent(this, character.class);
        startActivity(intent);
    }
    public void openStory(View view){
        Intent intent = new Intent(this, story.class);
        startActivity(intent);
    }
    public void openDoor(View view){
        Intent intent = new Intent(this, door.class);
        startActivity(intent);
    }
    public void openUniversity(View view){
        Intent intent = new Intent(this, university.class);
        startActivity(intent);
    }
    public void openHome(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openQuiz(View view){
        Intent intent = new Intent(this, quiz.class);
        startActivity(intent);
    }


}