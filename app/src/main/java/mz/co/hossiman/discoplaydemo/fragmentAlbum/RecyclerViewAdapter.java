package mz.co.hossiman.discoplaydemo.fragmentAlbum;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import mz.co.hossiman.discoplaydemo.R;
import mz.co.hossiman.discoplaydemo.model.Album;

/**
 * Created by secreto on 2/14/18.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContex;
    List<Album> albuns;

    public RecyclerViewAdapter(Context mContex, List<Album> albuns) {
        this.mContex = mContex;
        this.albuns = albuns;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContex).inflate(R.layout.cards_album, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tvAlbumTitulo.setText(albuns.get(position).getTitulo());
        holder.imgAlbumThumbnail.setImageResource(albuns.get(position).getThumbnail());
    }

    @Override
    public int getItemCount() {
        return albuns.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvAlbumTitulo;
        ImageView imgAlbumThumbnail;
        CardView cardView;

        public MyViewHolder(View itemView) {
            super(itemView);

            tvAlbumTitulo = (TextView) itemView.findViewById(R.id.txtAlbumTitulod);
            imgAlbumThumbnail = (ImageView) itemView.findViewById(R.id.ivAlbumImgId);
            cardView = (CardView) itemView.findViewById(R.id.cardViewId);
        }
    }
}
