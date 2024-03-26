package com.example.aboutme;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.aboutme.databinding.FragmentThirdBinding;

public class ThirdFragment extends Fragment {

    private FragmentThirdBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        binding = FragmentThirdBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Set up action for the back button
        binding.buttonPrevious.setOnClickListener(v ->
                requireActivity().onBackPressed()
        );

        // Set up action for the phone number TextView
        binding.textViewPhone.setOnClickListener(v ->
                Toast.makeText(getContext(), "Calling " + binding.textViewPhone.getText(), Toast.LENGTH_SHORT).show()
        );
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            // Handle Settings menu item click
            return true;
        } else if (id == R.id.action_about) {
            // Handle About menu item click
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
