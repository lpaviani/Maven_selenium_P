FROM selenium/standalone-chrome

RUN sudo apt update && sudo apt install -y \
openjdk-8-jdk \
maven 
COPY . /app
WORKDIR /app
CMD ["sudo", "mvn", "clean", "test"]
