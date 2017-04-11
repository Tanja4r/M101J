package com.mongodb;


import spark.Route;
import spark.Spark;
import spark.Request;
import spark.Response;


/**
 * todo: class comment
 *
 * @author traznatovic
 */
public class HelloWorldSparkStyle
{
  public static void main(String[] args)
  {
    Spark.get ("/",new Route()
    {
      @Override
      public Object handle(final Request request, final Response response)
      {
        return "Hello again from Spark";
      }
    });
    Spark.get ("/hello",new Route()
        {
          @Override
          public Object handle(final Request request, final Response response)
          {
            return "A sad nešto sasvim drugačije!";
          }
        });
    Spark.get ("/echo/:wc",new Route()
            {
              @Override
              public Object handle(final Request request, final Response response)
              {
                return request.params(":wc");
              }
            });


  }
}
