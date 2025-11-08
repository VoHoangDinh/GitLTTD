package com.example.vohoangdinh_recycleview;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TaskViewHolder extends RecyclerView.ViewHolder {

    TextView textViewTask;
    CheckBox checkBoxDone;

    public TaskViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewTask = itemView.findViewById(R.id.textViewTask);
        checkBoxDone = itemView.findViewById(R.id.checkBoxDone);
    }

    public void bind(Task task, OnTaskClickListener listener) {
        textViewTask.setText(task.getTitle());
        checkBoxDone.setChecked(task.isDone());

        itemView.setOnClickListener(v -> listener.onTaskClicked(task));

        checkBoxDone.setOnCheckedChangeListener((buttonView, isChecked) -> {
            task.setDone(isChecked);
        });
    }
}
