package org.algosketch.androidtemplate.feature.memo

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.viewModels
import org.algosketch.androidtemplate.R
import org.algosketch.androidtemplate.databinding.FragmentMemoBinding
import org.algosketch.androidtemplate.global.base.BaseFragment

class MemoFragment : BaseFragment<FragmentMemoBinding>() {
    override val layoutResourceId = R.layout.fragment_memo
    private val viewModel: MemoViewModel by viewModels()

    override fun initState() {
        viewModel.getMemo()
    }

    override fun initDataBinding() {
        binding.viewModel = viewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<EditText>(R.id.new_content_input).addTextChangedListener(object :
            TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun onTextChanged(text: CharSequence?, p1: Int, p2: Int, p3: Int) {
                viewModel.inputMemo.postValue(text.toString())
            }
            override fun afterTextChanged(text: Editable?) {}
        })
    }
}