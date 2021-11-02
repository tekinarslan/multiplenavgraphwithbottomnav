package com.example.multiplenavgraphwithbottomnav.testui

import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavDestination
import androidx.navigation.navOptions
import com.example.multiplenavgraphwithbottomnav.R


object Const {
    var isCheck = false
}


class A1Fragment : TestBaseFragment("A1", true) {
    override fun onBackPressed() {
        navController.navigate(R.id.a4_fragment,null, navOptions {
            popUpTo(R.id.a2_fragment){
                inclusive = false
            }
        })
    }
}

class A2Fragment : TestBaseFragment("A2") {

}
class A3Fragment : TestBaseFragment("A3") {
    override fun onBackPressed() {
        if (!Const.isCheck){
            Const.isCheck = true

           val nd = NavDestination("com.example.multiplenavgraphwithbottomnav.testui.A4Fragment").apply {
                label = "sefa"
                id = 1234
            }

            val bsa = NavBackStackEntry.create(requireContext(), nd)
            navController.backQueue.add(navController.backQueue.size-1, bsa)
        }else{
            navController.popBackStack()
        }
    }
}

class A4Fragment : TestBaseFragment("A4") {
    override fun onBackPressed() {
        navController.popBackStack(R.id.a2_fragment, false)
    }
}

class B1Fragment : TestBaseFragment("B1") {

}

class B2Fragment : TestBaseFragment("B2") {

}

class B3Fragment : TestBaseFragment("B3") {
    override fun onBackPressed() {

        navController.popBackStack(R.id.a2_fragment, false)


    }
}

class B4Fragment : TestBaseFragment("B4") {

}

class C1Fragment : TestBaseFragment("C1") {

}

class C2Fragment : TestBaseFragment("C2") {

}

class C3Fragment : TestBaseFragment("C3") {

}

class C4Fragment : TestBaseFragment("C4") {

}

class D1Fragment : TestBaseFragment("D1") {

}

class D2Fragment : TestBaseFragment("D2") {

}

class D3Fragment : TestBaseFragment("D3") {

}

class D4Fragment : TestBaseFragment("D4") {

}