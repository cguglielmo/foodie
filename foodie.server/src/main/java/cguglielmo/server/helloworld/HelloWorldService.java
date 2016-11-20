package cguglielmo.server.helloworld;

import cguglielmo.server.ServerSession;
import cguglielmo.shared.helloworld.HelloWorldFormData;
import cguglielmo.shared.helloworld.IHelloWorldService;

public class HelloWorldService implements IHelloWorldService {

  @Override
  public HelloWorldFormData load(HelloWorldFormData input) {
    StringBuilder msg = new StringBuilder();
    msg.append("Hello ").append(ServerSession.get().getUserId()).append('!');
    input.getMessage().setValue(msg.toString());
    return input;
  }
}
