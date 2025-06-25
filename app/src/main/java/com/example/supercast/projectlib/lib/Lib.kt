package com.example.supercast.projectlib.lib



class Lib () {

	companion object {

		fun formatStarsNumber (num: Int, s: String = "$num"): String = when (num) {

			in 0..999 -> s
			in 1000..9999 -> s.substring(0, 1) + "." + s.substring(1, 2) + "k"
			in 10000..999999 -> s.dropLast(3) + "k"
			in 1000000..9999999 -> s.substring(0, 1) + "." + s.substring(1, 2) + "m"
			in 10000000..999999999 -> s.dropLast(6) + "m"
			in 1000000000..9999999999 -> s.substring(0, 1) + "." + s.substring(1, 2) + "b"
			else -> s.dropLast(9) + "b"

		}

//		fun formatTime (num: Int): String {
//
//			return ""
//
//		}

	}

}