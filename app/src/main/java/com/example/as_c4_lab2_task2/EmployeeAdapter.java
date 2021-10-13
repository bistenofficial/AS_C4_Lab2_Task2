package com.example.as_c4_lab2_task2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.ViewHolder> {
    private List<Employee> mEmployee;

    // Provide a direct reference to each of the views within a data item
// Used to cache the views within the item layout for fast access
    public class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView name;
        public ImageView photo;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.textViewName);
            photo = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }

    @Override
    public EmployeeAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View stateView = inflater.inflate(R.layout.recyclerview_item_layout, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(stateView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(EmployeeAdapter.ViewHolder holder, int position) {
        // Get the data model based on position
        Employee employee = mEmployee.get(position);
        // Set item views based on your views and data model
        TextView name = holder.name;
        name.setText(employee.getfName()+" "+employee.getsName());

        ImageView photo = holder.photo;
        photo.setImageResource(employee.getPhoto());
    }

    public int getItemCount() {
        return mEmployee.size();
    }

    public EmployeeAdapter(List<Employee> employees) {
        mEmployee = employees;
    }
}
