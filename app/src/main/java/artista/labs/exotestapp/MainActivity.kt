package artista.labs.exotestapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val videoList = ArrayList<VideoInfo>()
    lateinit var videoAdapter: VideoRecyclerViewAdapter
    lateinit var customRv: ExoPlayerRecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        prepareVideoList()
        prepareRv()
    }

    private fun prepareRv() {
        customRv = rvVideo
        customRv.setVideoInfoList(videoList)
        videoAdapter = VideoRecyclerViewAdapter(videoList)
        customRv.apply {
            setHasFixedSize(true)
            adapter = videoAdapter
            layoutManager = LinearLayoutManager(context)
        }

    }

    private fun prepareVideoList() {
        videoList.add(
            VideoInfo(
                1,
                "Some long heading giving some sort of argument. Probably say two liner",
                "https://s3-ap-southeast-1.amazonaws.com/push-images/exo-test/videoplayback.mp4",
                ""
            )
        )
        videoList.add(
            VideoInfo(
                2,
                "Some long heading giving some sort of argument. Probably say two liner",
                "https://s3-ap-southeast-1.amazonaws.com/push-images/exo-test/videoplayback.mp4",
                ""
            )
        )
        videoList.add(
            VideoInfo(
                3,
                "Some long heading giving some sort of argument. Probably say two liner",
                "https://s3-ap-southeast-1.amazonaws.com/push-images/exo-test/videoplayback.mp4",
                ""
            )
        )
        videoList.add(
            VideoInfo(
                4,
                "Some long heading giving some sort of argument. Probably say two liner",
                "https://s3-ap-southeast-1.amazonaws.com/push-images/exo-test/videoplayback.mp4",
                ""
            )
        )
        videoList.add(
            VideoInfo(
                5,
                "Some long heading giving some sort of argument. Probably say two liner",
                "https://s3-ap-southeast-1.amazonaws.com/push-images/exo-test/videoplayback.mp4",
                ""
            )
        )
    }

    override fun onStop() {
        super.onStop()
        if (customRv != null) customRv.onRelease()
    }
}
