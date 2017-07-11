package com.virtroop.simpledatabinding;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SwitchCompat;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ToggleButton;

import com.virtroop.simpledatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding _binding;
    SimplePOJO _sp = new SimplePOJO("Test");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set the binding to the root view of this layout
        _binding = ActivityMainBinding.bind(findViewById(R.id.container));

        //set the binding variables
        _binding.setPojo(_sp);

        //access views from binding
        _binding.button.setText("Changed text");
    }
}
