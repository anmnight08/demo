package music.play.cool.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import music.play.cool.R;
import music.play.cool.bean.Music;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.ViewHolder> {

    private List<Music> musicList;


    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView musicimage, ivFirgure;
        TextView musicname, tvNumber;

        public ViewHolder(View view) {
            super(view);
            musicimage = (ImageView) view.findViewById(R.id.music_image);
            musicname = view.findViewById(R.id.music_name);
            ivFirgure = view.findViewById(R.id.iv_figure);
            tvNumber = view.findViewById(R.id.tv_number);
        }

    }

    public MusicAdapter(List<Music> music) {
        musicList = music;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.music_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Music music = musicList.get(position);
        holder.musicimage.setImageResource(music.getImageId());
        holder.musicname.setText(music.getName());
        holder.ivFirgure.setImageResource(music.getFigureId());
        holder.tvNumber.setText(music.getNumber());
    }


    @Override
    public int getItemCount() {
        return musicList.size();
    }
}
