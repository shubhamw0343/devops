// File: src/com/example/utils/StringUtil.groovy


package com.example.utils

class StringUtil implements Serializable {
    
    def script

    StringUtil(script) {
        this.script = script
    }

    def info(String message) {
        script.echo "✅ [INFO] ${message}"
    }

    def warning(String message) {
        script.echo "⚠️ [WARN] ${message}"
    }
}
