# scala-boot-test

Test project of using Scala with Spring Boot with added logging.

Has the ability to build a container, but that requires a functional Docker environment. Works well with docker-machine.

## Running

{% highlight bash %}
./gradlew run
{% endhighlight %}

## Building to a jar

{% highlight bash %}
./gradlew build
{% endhighlight %}

## Building to a container

{% highlight bash %}
./gradlew bootDocker
{% endhighlight %}

## Running the created container

{% highlight bash %}
docker run --rm -p 8080:8080 sirile/scala-boot-test
{% endhighlight %}

# Better documentation to follow along with a blog post