package Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wonderzofwood.R;

import java.util.List;

public class MenuRecyclerAdapter extends RecyclerView.Adapter<MenuRecyclerAdapter.MyViewHolder> {
    //private Image
    private List<String> itemHeading;
    private List<String> itemDescription;

    public MenuRecyclerAdapter(List<String> itemHeading, List<String> itemDescription) {
        this.itemHeading = itemHeading;
        this.itemDescription = itemDescription;
        //do for image

    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.itemHeadingRow.setText(itemHeading.get(position));
        holder.itemDescriptionRow.setText(itemDescription.get(position));

    }

    @Override
    public int getItemCount() {
        return itemHeading.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView itemImageRow;
        TextView itemHeadingRow, itemDescriptionRow;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImageRow = itemView.findViewById(R.id.itemImage);
            itemHeadingRow = itemView.findViewById(R.id.itemHeading);
            itemDescriptionRow = itemView.findViewById(R.id.itemDescription);
        }
    }
}
