package artista.labs.exotestapp

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_layout_video.view.*

class VideoRvAdapter() : RecyclerView.Adapter<VideoRvAdapter.VideoViewHolder>() {

    lateinit var context: Context
    lateinit var videoList: ArrayList<VideoInfo>

    constructor(context: Context, videoList: ArrayList<VideoInfo>) : this() {
        this.context = context
        this.videoList = videoList
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): VideoViewHolder {
        return VideoViewHolder(LayoutInflater.from(p0.getContext()).inflate(R.layout.item_layout_video, p0, false))
    }

    override fun getItemCount(): Int {
        return videoList.size
    }

    override fun onBindViewHolder(p0: VideoViewHolder, p1: Int) {
        val videoInfo = videoList.get(p1)
    }

    class VideoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvTitle = itemView.textViewTitle
        val videoLayout = itemView.video_layout
        val progressBar = itemView.progressBar
    }
}
