package com.example.fetchdatainrecycle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class MyAdapter extends FirebaseRecyclerAdapter<model,MyAdapter.MyviewHolder> {

    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public MyAdapter(@NonNull FirebaseRecyclerOptions<model> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull MyviewHolder myviewHolder, int i, @NonNull model model) {

        myviewHolder.name.setText(model.getName());
        myviewHolder.email.setText(model.getEmail());


    }

    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      //  return null;

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singleitemrow,parent, false);
        return new MyviewHolder(view);

    }

    class MyviewHolder extends RecyclerView.ViewHolder
    {
        TextView name,email;

        public MyviewHolder(@NonNull View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.nametext);
            email = (TextView) itemView.findViewById(R.id.emailtext);

        }
    }


}
