package nyc.c4q.hakeemsackes_bramble.mtapp_vine;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by hakeemsackes-bramble on 12/10/16.
 */

public class VineHolder extends RecyclerView.ViewHolder {
    public TextView nameTextView;


    public VineHolder(ViewGroup parent) {
        super(parent);
        nameTextView = (TextView) itemView.findViewById(R.id.rv_name);

    }
}


