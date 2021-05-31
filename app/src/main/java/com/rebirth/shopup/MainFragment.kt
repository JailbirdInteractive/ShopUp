package com.rebirth.shopup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager.HORIZONTAL
import androidx.recyclerview.widget.RecyclerView
import com.adroitandroid.chipcloud.ChipCloud
import com.adroitandroid.chipcloud.ChipCloud.Configure
import com.adroitandroid.chipcloud.ChipListener
import fragments.MyProductRecyclerViewAdapter
import fragments.ProductAdapter
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
        val chipCloud: ChipCloud = view.findViewById(R.id.chip_cloud)
        initCarousel(carousel)
        val previewRecyclerView: RecyclerView =
            view.findViewById(R.id.main_recommend_product_recyclerview)
        val moreRecyclerView: RecyclerView = view.findViewById(R.id.main_more_product_recyclerview)
        initMoreProducts(moreRecyclerView)
        initRecommendProducts(previewRecyclerView)
        initChips(chipCloud)
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
                "Sony Camera",
                "https://images-na.ssl-images-amazon.com/images/I/416b8xNfDJL._AC_.jpg",
                "",
                "$400",
                "user001"
            )
        )
        list.add(
            Product(
                "001",
                "LONGYUAN Women's Summer Sleeveless Casual Dresses Swing Cover Up Elastic Sundress with Pockets",
                "https://images-na.ssl-images-amazon.com/images/I/61xREstO9VL._AC_UY741_.jpg",
                "",
                "$20",
                "user001"
            )
        )
        list.add(
            Product(
                "001",
                "SNAPTAIN S5C WiFi FPV Drone with 2K Camera,Voice Control, Wide-Angle Live Video RC Quadcopter with Altitude Hold, Gravity Sensor Function, RTF One Key Take Off/Landing, Compatible w/VR Headset",
                "https://images-na.ssl-images-amazon.com/images/I/71-LV9vYPmL._AC_SX522_.jpg",
                "",
                "$40",
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

    private fun initMoreProducts(recyclerView: RecyclerView) {
        val list = ArrayList<Product>()
        recyclerView.layoutManager = GridLayoutManager(context, 2)
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
                "Sony Camera",
                "https://images-na.ssl-images-amazon.com/images/I/416b8xNfDJL._AC_.jpg",
                "",
                "$400",
                "user001"
            )
        )
        list.add(
            Product(
                "001",
                "SNAPTAIN S5C WiFi FPV Drone with 2K Camera,Voice Control, Wide-Angle Live Video RC Quadcopter with Altitude Hold, Gravity Sensor Function, RTF One Key Take Off/Landing, Compatible w/VR Headset",
                "https://images-na.ssl-images-amazon.com/images/I/71-LV9vYPmL._AC_SX522_.jpg",
                "",
                "$40",
                "user001"
            )
        )
        list.add(
            Product(
                "001",
                "Women's summer dress",
                "https://images-na.ssl-images-amazon.com/images/I/61xREstO9VL._AC_UY741_.jpg",
                "",
                "$20",
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
        val productAdapter =
            ProductAdapter(list)
        recyclerView.adapter = productAdapter

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

        list.add(
            CarouselItem(
                imageUrl = "https://images-na.ssl-images-amazon.com/images/I/71-LV9vYPmL._AC_SX522_.jpg",
                caption = "FPV wifi Drones"
            )
        )


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

    private fun initChips(chipCloud: ChipCloud) {


        val cats = arrayOf(
            "Appliances",
            "Apps & Games",
            "Arts, Crafts, & Sewing",
            "Automotive Parts & Accessories",
            "Baby", "Computers & Electronics"
        )
        val categories = arrayOf(
            "Appliances",
            "Apps & Games",
            "Arts, Crafts, & Sewing",
            "Automotive Parts & Accessories",
            "Baby",
            "Beauty & Personal Care",
            "Books",
            "CDs & Vinyl",
            "Cell Phones & Accessories",
            "Clothing, Shoes and Jewelry",
            "Collectibles & Fine Art",
            "Computers",
            "Electronics",
            "Garden & Outdoor",

            "Handmade",
            "Health, Household & Baby Care",
            "Home & Kitchen",
            "Industrial & Scientific",
            "Luggage & Travel Gear",
            "Musical Instruments",
            "Office Products",
            "Pet Supplies",
            "Sports & Outdoors"
        )
        //chipCloud.addChips(categories)

        Configure()
            .chipCloud(chipCloud)
            .labels(cats)

            .chipListener(object : ChipListener {
                override fun chipSelected(index: Int) {
                    println("Chips: $index")
                }

                override fun chipDeselected(index: Int) {
                    //...
                }
            })
            .build()
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