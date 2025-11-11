
def call(Map args) {
    // You can access arguments by their key
    def message = args.message
    def name = args.name
    
    echo "Hello, ${name}! The message is: ${message}"
}
