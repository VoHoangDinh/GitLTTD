package com.example.vohoangdinh_recycleview;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnTaskClickListener {

    private List<Task> tasks;
    private TaskAdapter adapter;
    private EditText editTextTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerViewTasks);
        editTextTask = findViewById(R.id.editTextTask);
        Button buttonAdd = findViewById(R.id.buttonAdd);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Danh sách công việc ban đầu
        tasks = new ArrayList<>();
        tasks.add(new Task("Làm bài tập Android"));
        tasks.add(new Task("Đi chợ mua đồ ăn"));
        tasks.add(new Task("Học tiếng Anh"));

        adapter = new TaskAdapter(this, tasks, this);
        recyclerView.setAdapter(adapter);

        buttonAdd.setOnClickListener(v -> {
            String title = editTextTask.getText().toString().trim();
            if (!title.isEmpty()) {
                tasks.add(new Task(title));
                adapter.notifyItemInserted(tasks.size() - 1);
                editTextTask.setText("");
            } else {
                Toast.makeText(this, "Vui lòng nhập công việc!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onTaskClicked(Task task) {
        Toast.makeText(this, "Bạn chọn: " + task.getTitle(), Toast.LENGTH_SHORT).show();
    }
}
