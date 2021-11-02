package com.example.multiplenavgraphwithbottomnav.testui

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.example.multiplenavgraphwithbottomnav.BuildConfig
import com.example.multiplenavgraphwithbottomnav.R
import com.example.multiplenavgraphwithbottomnav.app.setGone
import com.example.multiplenavgraphwithbottomnav.app.setVisible

abstract class TestBaseFragment(
    val name: String,
    val backPressEnabled : Boolean = false
) : Fragment(R.layout.test_fragment) {

    private val backPressedDispatcher = object : OnBackPressedCallback(backPressEnabled) {
        override fun handleOnBackPressed() {
            this@TestBaseFragment.onBackPressed()
        }
    }

    protected val mainNavController: NavController by lazy {
        Navigation.findNavController(requireActivity(), R.id.test_nav_host)
    }

    protected val navController: NavController by lazy {
        findNavController()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activity?.onBackPressedDispatcher?.addCallback(viewLifecycleOwner, backPressedDispatcher)

        val stackMainList = mainNavController.backQueue.map {
            it.destination.displayName.replace(BuildConfig.APPLICATION_ID + ":id/", "")
        }
        view.findViewById<TextView>(R.id.stackMain).text = stackMainList.joinToString("\n") { it }

        val stackList = navController.backQueue.map {
            it.destination.displayName.replace(BuildConfig.APPLICATION_ID + ":id/", "")
        }
        view.findViewById<TextView>(R.id.stack).text = stackList.joinToString("\n") { it }

        val currentViewId =
            resources.getIdentifier(name.lowercase(), "id", BuildConfig.APPLICATION_ID)
        val tv = view.findViewById<TextView>(currentViewId)
        tv?.setBackgroundResource(R.drawable.shape_misty_rose_8dp_bordered_2dp)

        if (name.startsWith("A") || name.startsWith("B") || name.startsWith("C")) {
            view.findViewById<View>(R.id.bottom_view).setGone()
            view.findViewById<TextView>(R.id.d1)
                .setBackgroundResource(R.drawable.shape_misty_rose_8dp_bordered_2dp)
        } else {
            view.findViewById<View>(R.id.bottom_view).setVisible()
        }

        view.findViewById<View>(R.id.a1).setOnClickListener { navigateTest(R.id.a1_fragment, "A1") }
        view.findViewById<View>(R.id.a2).setOnClickListener { navigateTest(R.id.a2_fragment, "A2") }
        view.findViewById<View>(R.id.a3).setOnClickListener { navigateTest(R.id.a3_fragment, "A3") }
        view.findViewById<View>(R.id.a4).setOnClickListener { navigateTest(R.id.a4_fragment, "A4") }

        view.findViewById<View>(R.id.b1).setOnClickListener { navigateTest(R.id.b1_fragment, "B1") }
        view.findViewById<View>(R.id.b2).setOnClickListener { navigateTest(R.id.b2_fragment, "B2") }
        view.findViewById<View>(R.id.b3).setOnClickListener { navigateTest(R.id.b3_fragment, "B3") }
        view.findViewById<View>(R.id.b4).setOnClickListener { navigateTest(R.id.b4_fragment, "B4") }

        view.findViewById<View>(R.id.c1).setOnClickListener { navigateTest(R.id.c1_fragment, "C1") }
        view.findViewById<View>(R.id.c2).setOnClickListener { navigateTest(R.id.c2_fragment, "C2") }
        view.findViewById<View>(R.id.c3).setOnClickListener { navigateTest(R.id.c3_fragment, "C3") }
        view.findViewById<View>(R.id.c4).setOnClickListener { navigateTest(R.id.c4_fragment, "C4") }

        view.findViewById<View>(R.id.d1).setOnClickListener { navigateTest(R.id.d1_fragment, "D1") }
        view.findViewById<View>(R.id.d2).setOnClickListener { navigateTest(R.id.d2_fragment, "D2") }
        view.findViewById<View>(R.id.d3).setOnClickListener { navigateTest(R.id.d3_fragment, "D3") }
        view.findViewById<View>(R.id.d4).setOnClickListener { navigateTest(R.id.d4_fragment, "D4") }

        val isD = name == "D2" || name == "D3" || name == "D4"

        view.findViewById<View>(R.id.layout_1).setVisible(!isD)
        view.findViewById<View>(R.id.layout_2).setVisible(!isD)
        view.findViewById<View>(R.id.layout_3).setVisible(!isD)
        view.findViewById<View>(R.id.layout_4).setVisible(!isD)

    }

    open fun navigateTest(id: Int, target: String) {
        nav(id, target)
    }

    open fun onBackPressed() {

    }

    private fun nav(id: Int, target: String) {
        navController.hyNavigate(id, target) {
            mainNavController.hyNavigate(id, target)
        }
    }

    private fun NavController.hyNavigate(id: Int, target: String, catch: (() -> Unit)? = null) {
        try {
            navigate(id, null, navOptions {
                launchSingleTop = false
                restoreState = true
            })
        } catch (t: Throwable) {
//            this@TestBaseFragment.view?.snack("error : " + this@TestBaseFragment.name + " -> " + target)
            catch?.invoke()
        }
    }

    override fun onDestroyView() {
        // It is optional to remove since our dispatcher is lifecycle-aware. But it wouldn't hurt to just remove it to be on the safe side.
        backPressedDispatcher.remove()
        super.onDestroyView()
    }

}