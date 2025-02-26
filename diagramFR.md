```mermaid

classDiagram
    class Client {
        -id: Long
        -name: String
        -email: String
        
        +login()
    }

    class Order {
        -id: Long
        -orderDate: Date
        
    }

    class OrderDetail {
        -id: Long
        -qty: int
        -price: BigDecimal
    }

    class Product {
        -id: Long
        -description: String
        -
    }


    Client "1" -- "*" Order : has
    Order "1" -- "*" OrderDetail : contains
    OrderDetail "*" -- "1" Product : references
    
```