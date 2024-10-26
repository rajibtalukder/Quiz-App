package com.example.quizapp

object Constants {

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        //1
        val qus1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.argentina,
            "Argentina", "Australia", "Alameda", "Austria",
            1
        )
        questionList.add(qus1)
        //2
        val qus2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.australia,
            "Argentina", "Alameda", "Austria", "Australia",
            4
        )
        questionList.add(qus2)
        //3
        val qus3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.belgium,
            "Belgium", "Bangladesh", "Brazil", "Belarus",
            1
        )
        questionList.add(qus3)
        //4
        val qus4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.brazil,
            "Belgium", "Bangladesh", "Brazil", "Belarus",
            3
        )
        questionList.add(qus4)
        //5
        val qus5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.denmark,
            "Finland", "Denmark", "France", "Ireland",
            2
        )
        questionList.add(qus5)
        //6
        val qus6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.fiji,
            "Switzerland", "Japan", "fini", "Poland",
            3
        )
        questionList.add(qus6)
        //7
        val qus7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.germany,
            "Luxembourg", "Uganda", "Turkey", "Germany",
            4
        )
        questionList.add(qus7)



        return questionList
    }
}