# ISO 8583 Message Parser

A Java-based parser and decoder for ISO 8583 financial transaction messages. This tool helps analyze and understand the structure of financial messages used in banking, ATM, and point-of-sale systems.

## 📋 Overview

ISO 8583 is an international standard for financial transaction card-originated messages. This Java application parses raw ISO 8583 messages and provides a human-readable breakdown of each component, making it easier to understand and debug financial transaction data.

## ✨ Features

- **Complete ISO 8583 Support**: Parses all standard fields (1-128)
- **Bitmaps Processing**: Handles both primary and secondary bitmaps
- **Variable Length Fields**: Correctly processes fields with dynamic lengths
- **Formatted Output**: Clean, column-based display of field data
- **Field Descriptions**: Provides meanings and interpretations for common values
- **Error Handling**: Robust parsing with exception management

## 🚀 Getting Started

### Prerequisites

- Java 8 or higher
- Git

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/iso8583-parser.git
   cd iso8583-parser
   ```

2. **Compile the project**
   ```bash
   javac iso/iso.java
   ```

3. **Run the application**
   ```bash
   java iso.iso
   ```

### Usage

1. Run the program
2. Enter an ISO 8583 message when prompted (without spaces):
   ```
   Insert ISO without empty spaces: 
   010060200000000000000012345678901234...
   ```

3. The program will output a formatted breakdown showing:
   - Field names
   - Raw values
   - Interpretations/meanings

## 📝 Example Input/Output

**Input:**
```
010060200000000000000012345678901234567890123456789012345678901234...
```

**Output:**
```
Product Indicator                 00              Base(network management messages)
ReleaseNumber                     01              01
If Regrected                      020             Invalid Status
Originator Code                   0               IfStatement
Responder Code                    0               IfStatement
MTI                               6020            IfStatement
Primary Bit Map                   8000000000000000 
2. Primary Account Number         1612345678901234 IfStatement
... (more fields based on bitmap)
```

## 🏗️ Project Structure

```
iso8583-parser/
├── iso/
│   └── iso.java          # Main parser class
├── README.md             # This file
└── .gitignore           # Git ignore file
```

## 🔧 Key Methods

- `toString()`: Main parsing engine that processes the entire message
- `convertToBinary()`: Converts hexadecimal bitmaps to binary
- Field-specific methods: `GetP1()`, `GetP2()`, ..., `ToStringP1()`, `ToStringP2()`, etc.
- Meaning interpretation methods for various fields

## 📊 Supported Fields

The parser handles all standard ISO 8583 fields including:

- **Primary Account Number** (Field 2)
- **Processing Code** (Field 3)
- **Transaction Amount** (Field 4)
- **System Trace Audit Number** (Field 11)
- **Merchant Information** (Fields 41-43)
- **Currency Codes** (Fields 49-51)
- **PIN Data** (Field 52)
- **Message Authentication Code** (Fields 64, 128)
- And many more...

## 🛠️ Development

### Adding New Field Interpretations

To add meanings for specific field values, modify the corresponding `GetMeanPXX()` method:

```java
public String GetMeanP39() {
    switch(z) {
        case "00" -> return "Approved";
        case "01" -> return "Refer to card issuer";
        // Add more response codes...
        default -> return "Unknown response";
    }
}
```

### Extending Functionality

The code is structured to allow easy extension for:
- Custom field definitions
- Additional message formats
- Enhanced validation rules
- Database integration

## 🤝 Contributing

1. Fork the project
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## ⚠️ Disclaimer

This tool is for educational and development purposes. Always ensure compliance with financial regulations and security standards when working with real transaction data.

## 📞 Support

If you have any questions or issues, please open an issue on GitHub.
