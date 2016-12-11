package nyc.c4q.hakeemsackes_bramble.mtapp_vine;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import nyc.c4q.hakeemsackes_bramble.mtapp_vine.pojos.Record;

/**
 * Created by hakeemsackes-bramble on 12/10/16.
 */

public class VineAdapter extends RecyclerView.Adapter<VineHolder>{


    private ArrayList<Record> records;

    @Override
    public VineHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View WPView = inflater.inflate(R.layout.rv_layout, parent, false);
        return new VineHolder((ViewGroup) WPView);

    }

    @Override
    public void onBindViewHolder(VineHolder holder, int position) {
        holder.nameTextView.setText(records.get(position).getUsername());
    }

    @Override
    public int getItemCount() {
        return records.size();
    }
}
