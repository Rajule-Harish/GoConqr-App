package com.example.puc_app.ui.doubts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.puc_app.databinding.FragmentDoubtsBinding;

import com.example.puc_app.ui.doubts.DoubtsViewModel;

public class DoubtsFragment extends Fragment {

    private FragmentDoubtsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DoubtsViewModel doubtsViewModel =
                new ViewModelProvider(this).get(DoubtsViewModel.class);

        binding = FragmentDoubtsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textDoubts;
        doubtsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }



}