package com.covenant.qotd.Logic

enum class Category (val quotes: List<String>){
    Inspirational(
        listOf("\"Believe you can and you're halfway there.\" - Theodore Roosevelt",
                "\"The future belongs to those who believe in the beauty of their dreams.\" - Eleanor Roosevelt",
                "\"Success is not final, failure is not fatal: It is the courage to continue that counts.\" - Winston Churchill",
                "\"The only person you are destined to become is the person you decide to be.\" - Ralph Waldo Emerson",
                "\"Dream big and dare to fail.\" - Norman Vaughan",
                "\"The harder you work for something, the greater you'll feel when you achieve it.\" - Unknown",
                "\"You are never too old to set another goal or to dream a new dream.\" - C.S. Lewis",
                "\"The only limit to our realization of tomorrow will be our doubts of today.\" - Franklin D. Roosevelt",
                "\"The journey of a thousand miles begins with one step.\" - Lao Tzu",
                "\"You miss 100% of the shots you don't take.\" - Wayne Gretzky",
                "\"Life is 10% what happens to us and 90% how we react to it.\" - Charles R. Swindoll"
            )
    ),
    Love(
        listOf(
            "\"Love is composed of a single soul inhabiting two bodies.\" - Aristotle",
            "\"Love is a canvas furnished by nature and embroidered by imagination.\" - Voltaire",
            "\"Love doesn't make the world go 'round. Love is what makes the ride worthwhile.\" - Franklin P. Jones",
            "\"Love is the poetry of the senses.\" - Honoré de Balzac",
            "\"Love is when you look into someone's eyes and see everything you need.\" - Unknown",
            "\"Love is not just something you feel. It is something you do.\" - David Wilkerson",
            "\"Behind the mask of love often hides the face of obsession.\" - Unknown",
            "\"In the darkest corners of our hearts, love can breed the most wicked desires.\" - Unknown",
            "\"Beware the allure of love, for it can be the deadliest trap of them all.\" - Unknown",
            "\"Love is the emblem of eternity; it confounds all notion of time; effaces all memory of a beginning, all fear of an end.\" - Madame de Staël",
            "\"The reduction of the universe to the compass of a single being, and the extension of a single being until it reaches God - that is love.\""
        )
    ),
    Existential(
        listOf(
            "\"Every existing thing is born without reason, prolongs itself out of weakness, and dies by chance.\" - Jean-Paul Sartre",
            "\"Man is condemned to be free; because once thrown into the world, he is responsible for everything he does.\" - Jean-Paul Sartre",
            "\"Why are we here in this vast, indifferent universe, if not to define our own purpose?\" - Unknown",
            "\"In the face of absurdity, the most profound question becomes: Why exist at all?\" - Albert Camus",
            "\"In the silence of the cosmos, we question whether God's absence is the true divine revelation.\" - Unknown",
            "\"Do we exist to live, or do we live to exist?\" - Jean-Paul Sartre",
            "\"If existence precedes essence, then what do we become when we choose not to become anything?\" - Unknown",
            "\"The only way to deal with an unfree world is to become so absolutely free that your very existence is an act of rebellion.\" - Albert Camus",
            "\"Life has no meaning, It is up to you to give it a meaning, and value is nothing but the meaning that you choose.\" - Jean-Paul Sartre"

        )
    )
}


fun GetQuote(category: Category): String{
    return when(category){
        Category.Love -> Category.Love.quotes.random()
        Category.Existential -> Category.Existential.quotes.random()
        Category.Inspirational -> Category.Inspirational.quotes.random()

    }
}

fun GetQotd():String{
    val category = Category.values().random()
    val Quote = category.quotes.random()
    return Quote
}



