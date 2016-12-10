package nyc.c4q.hakeemsackes_bramble.mtapp_vine;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by hakeemsackes-bramble on 12/10/16.
 */

public class VineAdapter extends RecyclerView.Adapter<VineHolder>{

    @Override
    public VineHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View WPView = inflater.inflate(R.layout.rv_layout, parent, false);
        return new VineHolder((ViewGroup) WPView);

    }

    @Override
    public void onBindViewHolder(VineHolder holder, int position) {
        holder.nameTextView.setText(userName.getTitle());
    }

    @Override
    public int getItemCount() {
        return username.size();
    }
}
