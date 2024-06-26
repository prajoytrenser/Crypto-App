package com.example.cryptoapp.presentation.coin_details

import com.example.cryptoapp.domain.model.Coin
import com.example.cryptoapp.domain.model.CoinDetail
import java.lang.Error

data class CoinDetailState(
    var isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
