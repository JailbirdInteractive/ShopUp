package fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager.HORIZONTAL
import androidx.recyclerview.widget.RecyclerView
import com.rebirth.shopup.R
import models.Product
import org.imaginativeworld.whynotimagecarousel.CarouselItem
import org.imaginativeworld.whynotimagecarousel.ImageCarousel

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val carousel: ImageCarousel = view.findViewById(R.id.carousel)
        initCarousel(carousel)
        val previewRecyclerView: RecyclerView =
            view.findViewById(R.id.main_recommend_product_recyclerview)
        initRecommendProducts(previewRecyclerView)
    }

    private fun initRecommendProducts(recyclerView: RecyclerView) {
        val list = ArrayList<Product>()
        recyclerView.layoutManager = LinearLayoutManager(context, HORIZONTAL, false)
        list.add(
            Product(
                "001",
                "Shoes",
                "https://images-na.ssl-images-amazon.com/images/I/61xVuKFC-HL._AC_UY500_.jpg",
                "",
                "$400",
                "user001"
            )
        )
        list.add(
            Product(
                "001",
                "Shoes",
                "https://images-na.ssl-images-amazon.com/images/I/61xVuKFC-HL._AC_UY500_.jpg",
                "",
                "$400",
                "user001"
            )
        )
        list.add(
            Product(
                "001",
                "Shoes",
                "https://images-na.ssl-images-amazon.com/images/I/61xVuKFC-HL._AC_UY500_.jpg",
                "",
                "$400",
                "user001"
            )
        )
        list.add(
            Product(
                "001",
                "Shoes",
                "https://images-na.ssl-images-amazon.com/images/I/61xVuKFC-HL._AC_UY500_.jpg",
                "",
                "$400",
                "user001"
            )
        )
        list.add(
            Product(
                "001",
                "Shoes",
                "https://images-na.ssl-images-amazon.com/images/I/61xVuKFC-HL._AC_UY500_.jpg",
                "",
                "$400",
                "user001"
            )
        )
        list.add(
            Product(
                "001",
                "Shoes",
                "https://images-na.ssl-images-amazon.com/images/I/61xVuKFC-HL._AC_UY500_.jpg",
                "",
                "$400",
                "user001"
            )
        )
        list.add(
            Product(
                "001",
                "Shoes",
                "https://images-na.ssl-images-amazon.com/images/I/61xVuKFC-HL._AC_UY500_.jpg",
                "",
                "$400",
                "user001"
            )
        )
        list.add(
            Product(
                "001",
                "Shoes",
                "https://images-na.ssl-images-amazon.com/images/I/61xVuKFC-HL._AC_UY500_.jpg",
                "",
                "$400",
                "user001"
            )
        )
        list.add(
            Product(
                "001",
                "Shoes",
                "https://images-na.ssl-images-amazon.com/images/I/61xVuKFC-HL._AC_UY500_.jpg",
                "",
                "$400",
                "user001"
            )
        )
        val productRecyclerViewAdapter: MyProductRecyclerViewAdapter =
            MyProductRecyclerViewAdapter(list)
        recyclerView.adapter = productRecyclerViewAdapter

    }

    private fun initCarousel(carousel: ImageCarousel) {
        val list = mutableListOf<CarouselItem>()

// Image URL with caption
        list.add(
            CarouselItem(
                imageDrawable = R.drawable.rings,
                caption = "Women's rings for sale. Silver and gold"
            )
        )

/*// Just image URL
        list.add(
            CarouselItem(
                imageUrl = "https://images.unsplash.com/photo-1534447677768-be436bb09401?w=1080"
            )
        )*/

// Image drawable with caption
        list.add(
            CarouselItem(
                imageUrl = "https://images-na.ssl-images-amazon.com/images/I/61xVuKFC-HL._AC_UY500_.jpg",
                caption = "Nike Jordan 1s for sale. Various sizes"
            )
        )
        list.add(
            CarouselItem(
                imageDrawable = R.drawable.camera,
                caption = "Sale on all Sony Mirrorless Cameras"
            )
        )
        carousel.addData(list)

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MainFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MainFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}