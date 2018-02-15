package mz.co.hossiman.discoplaydemo.fragmentTop;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import mz.co.hossiman.discoplaydemo.R;
import mz.co.hossiman.discoplaydemo.model.Musica;

/**
 * Created by secreto on 2/14/18.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    List<Musica> musicas;

    public RecyclerViewAdapter(Context mContext, List<Musica> musicas) {
        this.mContext = mContext;
        this.musicas = musicas;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.cards_top, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tvCantor.setText(musicas.get(position).getCantor());
        holder.tvTitulo.setText(musicas.get(position).getTitulo());
    }

    @Override
    public int getItemCount() {
        return musicas.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tvCantor, tvTitulo;

        public MyViewHolder(View itemView) {
            super(itemView);

            tvCantor = (TextView) itemView.findViewById(R.id.txtCantor);
            tvTitulo = (TextView) itemView.findViewById(R.id.txtTitulo);
        }
    }
}
