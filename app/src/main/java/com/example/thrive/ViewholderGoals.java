package com.example.thrive;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewholderGoals extends RecyclerView.ViewHolder {

    public TextView progress, name,name2,percent;
    public Button updateFlag;
    //public ProgressBar progressBar;
    //public Button updateprogress, editgoal, deletegoal;
    //public ImageView goalpicture;
    public ViewholderGoals(@NonNull View itemView) {
        super(itemView);

        progress = itemView.findViewById(R.id.progress);
        name = itemView.findViewById(R.id.progressgoalname);
        name2 = itemView.findViewById(R.id.progressgoalname2);
        updateFlag = itemView.findViewById(R.id.updateflagbtn);
        updateFlag = itemView.findViewById(R.id.updateflagbtn);
        percent = itemView.findViewById(R.id.percent);
        /*progressBar=itemView.findViewById(R.id.progress_bar);
        goalpicture=itemView.findViewById(R.id.goalpicture);
        updateprogress = itemView.findViewById(R.id.updateprogress_btn);
        editgoal = itemView.findViewById(R.id.editgoal_btn);
        deletegoal = itemView.findViewById(R.id.deletegoal_btn);

        deletegoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(listener!=null) {
                    int position = getAdapterPosition();
                    if(position!=RecyclerView.NO_POSITION) {
                        listener.onDeleteClick(position);

                    }
                }
            }
        });*/
    }
}