package com.example.puc_app.ui.signout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.puc_app.databinding.FragmentSignoutBinding;

import com.example.puc_app.ui.signout.SignoutViewModel;


public class SignoutFragment extends Fragment {

    private FragmentSignoutBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SignoutViewModel signoutViewModel =
                new ViewModelProvider(this).get(SignoutViewModel.class);

        binding = FragmentSignoutBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textSignOut;
        signoutViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}