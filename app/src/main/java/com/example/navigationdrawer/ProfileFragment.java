package com.example.navigationdrawer;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import java.util.zip.Inflater;

public class ProfileFragment extends Fragment implements View.OnClickListener {
    Button myButton;
    Button myButton2;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment_profile, container, false);
        myButton = (Button) myView.findViewById(R.id.button2);
        myButton2=myView.findViewById(R.id.button3);
        myButton2.setOnClickListener(this);
        myButton.setOnClickListener(this);
        return myView;

       // return v;
      //  return inflater.inflate(R.layout.fragment_profile,container,false);
    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.button2:
                Log.d("profile","Printing from profile fragment button");
                break;
//            case R.id.button3:
//                Log.d("profile","priting from the second button");
//                break;
            default:

                Log.d("profile","err");
                break;
        }
       // Log.d("hasan","Printing from profile fragment button listener");
    }
}
