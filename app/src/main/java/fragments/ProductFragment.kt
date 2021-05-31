package fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import com.rebirth.shopup.R
import com.rebirth.shopup.databinding.ProductFragmentBinding
import viewmodels.ProductViewModel

class ProductFragment : Fragment() {

    companion object {
        fun newInstance() = ProductFragment()
    }

    private lateinit var binding: ProductFragmentBinding
    private lateinit var viewModel: ProductViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.product_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = ProductFragmentBinding.bind(view)
        viewModel = ViewModelProvider(this).get(ProductViewModel::class.java)
        val args: ProductFragmentArgs by navArgs()
        val product = args.product
        binding.productTitle.setText(product.title)


    }


}