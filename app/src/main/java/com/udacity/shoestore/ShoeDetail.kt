package com.udacity.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.udacity.shoestore.databinding.FragmentShoeDetailBinding
import com.udacity.shoestore.models.Shoe
import com.udacity.shoestore.models.ShoeViewModel



class ShoeDetail : Fragment() {
    private lateinit var binding: FragmentShoeDetailBinding
    private lateinit var viewModel: ShoeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_detail, container, false)
        viewModel = ViewModelProvider(requireActivity()).get(ShoeViewModel::class.java)
        binding.shoe = Shoe("", "", "", "")
        binding.viewModel = viewModel
        binding.save.setOnClickListener {
            //addData()
            //view!!.findNavController()!!.popBackStack()
            view?.let { it1 ->
                Navigation.findNavController(it1).navigate(R.id.action_shoeDetail_pop_including_shoeList)
            }
        }
        binding.fab.setOnClickListener {
            view?.let { it1 -> Navigation.findNavController(it1).navigate(R.id.action_shoeDetail_pop_including_shoeList) }
        }
        binding.back.setOnClickListener {
            view?.let { it1 -> Navigation.findNavController(it1).navigate(R.id.action_shoeDetail_pop_including_shoeList) }
        }
        return binding.root
    }


//    private fun addData(){
//        val _name = binding.shoeName.text.toString()
//        val _description  = binding.shoeDescription.text.toString()
//        val _company = binding.shoeCompany.text.toString()
//        val _size = binding.shoeSize.text.toString()
//        val shoe = Shoe(_name,_size,_company,_description)
//
//        viewModel.addShoe(shoe)
//    }


}